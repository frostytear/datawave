package datawave.microservice.dictionary.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.Map;

@EnableConfigurationProperties(DataDictionaryProperties.class)
@ConfigurationProperties(prefix = "datawave.data.dictionary")
public class DataDictionaryProperties {
    
    private String modelName;
    private String modelTableName;
    private String metadataTableName;
    private int numThreads;
    private Map<String,String> normalizerMap;
    
    public String getModelName() {
        return modelName;
    }
    
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    
    public String getModelTableName() {
        return modelTableName;
    }
    
    public void setModelTableName(String modelTableName) {
        this.modelTableName = modelTableName;
    }
    
    public String getMetadataTableName() {
        return metadataTableName;
    }
    
    public void setMetadataTableName(String metadataTableName) {
        this.metadataTableName = metadataTableName;
    }
    
    public int getNumThreads() {
        return numThreads;
    }
    
    public void setNumThreads(int numThreads) {
        this.numThreads = numThreads;
    }
    
    public Map<String,String> getNormalizerMap() {
        return normalizerMap;
    }
    
    public void setNormalizerMap(Map<String,String> normalizerMap) {
        this.normalizerMap = normalizerMap;
    }
}
