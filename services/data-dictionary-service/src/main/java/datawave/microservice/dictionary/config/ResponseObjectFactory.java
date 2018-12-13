package datawave.microservice.dictionary.config;

import datawave.webservice.query.result.metadata.MetadataFieldBase;
import datawave.webservice.results.datadictionary.DataDictionaryBase;
import datawave.webservice.results.datadictionary.DescriptionBase;

public interface ResponseObjectFactory {
    <T,M extends MetadataFieldBase> DataDictionaryBase<T,M> getDataDictionary();
    <T> DescriptionBase<T> getDescription();
}
