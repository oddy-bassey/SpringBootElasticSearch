package com.revoltcode.SpringBootElasticSearch.document;

import com.revoltcode.SpringBootElasticSearch.helper.Indices;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = Indices.PERSON_INDEX)
@Setting(settingPath = "static/es-settings.json")
public class Person {

    @Field(type = FieldType.Keyword)
    private String id;

    @Field(type = FieldType.Text)
    private String name;
}
