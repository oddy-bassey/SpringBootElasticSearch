package com.revoltcode.SpringBootElasticSearch.configuration;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.revoltcode.SpringBootElasticSearch.repository")
@ComponentScan(basePackages = "com.revoltcode.SpringBootElasticSearch")
public class Config extends AbstractElasticsearchConfiguration {

    @Value("${elasticsearch.url}")
    private String elasticSearchUrl;

    @Bean
    @Override
    public RestHighLevelClient elasticsearchClient() {

        final ClientConfiguration config = ClientConfiguration
                .builder()
                .connectedTo(elasticSearchUrl)
                .build();

        return RestClients.create(config).rest();
    }
}
