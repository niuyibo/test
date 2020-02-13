//package com.testes.entity;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.elasticsearch.annotations.Document;
//import org.springframework.data.elasticsearch.annotations.Field;
//import org.springframework.data.elasticsearch.annotations.FieldType;
//
//@Document(indexName = "shakespeare",type = "doc")
//public class EsShakespeareEntity {
//    /**
//     * @Description: @Id注解必须是springframework包下的
//     * org.springframework.data.annotation.Id                       
//     *@Author: https://blog.csdn.net/chen_2890
//     */
//    @Id 
//    private Long id;
//    
//    @Field(type = FieldType.Integer)
//    private String line_id;
//    
//    @Field(type = FieldType.Keyword)
//    private String type;
//    
//    @Field(type = FieldType.Keyword)
//    private String play_name;
//    
//    @Field(type = FieldType.Integer)
//    private Double speech_number;
//    
//    @Field(type = FieldType.Keyword)
//    private String line_number;
//    
//    @Field(type = FieldType.Keyword)
//    private String speaker;
//    
//    @Field(type = FieldType.Keyword)
//    private String text_entry;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getLine_id() {
//        return line_id;
//    }
//
//    public void setLine_id(String line_id) {
//        this.line_id = line_id;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getPlay_name() {
//        return play_name;
//    }
//
//    public void setPlay_name(String play_name) {
//        this.play_name = play_name;
//    }
//
//    public Double getSpeech_number() {
//        return speech_number;
//    }
//
//    public void setSpeech_number(Double speech_number) {
//        this.speech_number = speech_number;
//    }
//
//    public String getLine_number() {
//        return line_number;
//    }
//
//    public void setLine_number(String line_number) {
//        this.line_number = line_number;
//    }
//
//    public String getSpeaker() {
//        return speaker;
//    }
//
//    public void setSpeaker(String speaker) {
//        this.speaker = speaker;
//    }
//
//    public String getText_entry() {
//        return text_entry;
//    }
//
//    public void setText_entry(String text_entry) {
//        this.text_entry = text_entry;
//    }
//    
//}
//
