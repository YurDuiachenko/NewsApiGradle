package com.example.newsapigradle.configurations;

import com.example.newsapigradle.configurations.adapters.NewDTOAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewsApiGradleApplicationConfiguration {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE);
        return modelMapper;
    }

    @Bean
    public HttpClient httpClient() {
        return HttpClients.createMinimal();
    }

    @Bean
    public Gson gson() {
        return new GsonBuilder().registerTypeAdapter(Long.class, new NewDTOAdapter()).create();
    }
}
