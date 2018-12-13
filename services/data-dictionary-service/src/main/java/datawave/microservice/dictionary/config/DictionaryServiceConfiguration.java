package datawave.microservice.dictionary.config;

import datawave.microservice.dictionary.data.DatawaveDataDictionary;
import datawave.microservice.dictionary.data.DatawaveDataDictionaryImpl;
import datawave.webservice.results.datadictionary.DefaultDataDictionary;
import datawave.webservice.results.datadictionary.DefaultDescription;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DictionaryServiceConfiguration {
    @Bean
    @RefreshScope
    @ConditionalOnMissingBean
    public DataDictionaryProperties dataDictionaryConfiguration() {
        return new DataDictionaryProperties();
    }

    @Bean
    @ConditionalOnMissingBean
    public DatawaveDataDictionary datawaveDataDictionary(ResponseObjectFactory responseObjectFactory) {
        return new DatawaveDataDictionaryImpl(responseObjectFactory);
    }

    @Bean
    @ConditionalOnMissingBean
    public ResponseObjectFactory responseObjectFactory() {
        return new ResponseObjectFactory() {
            @Override
            public DefaultDataDictionary getDataDictionary() {
                return new DefaultDataDictionary();
            }

            @Override
            public DefaultDescription getDescription() {
                return new DefaultDescription();
            }
        };
    }
}
