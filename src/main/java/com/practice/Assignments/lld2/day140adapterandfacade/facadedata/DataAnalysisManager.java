package com.practice.Assignments.lld2.day140adapterandfacade.facadedata;

import com.practice.Assignments.lld2.day140adapterandfacade.facadedata.models.*;
import com.practice.Assignments.lld2.day140adapterandfacade.facadedata.services.AnalysisAlgorithmService;
import com.practice.Assignments.lld2.day140adapterandfacade.facadedata.services.DataCollectionService;
import com.practice.Assignments.lld2.day140adapterandfacade.facadedata.services.DataPreprocessingService;
import com.practice.Assignments.lld2.day140adapterandfacade.facadedata.services.VisualizationService;

public class DataAnalysisManager {

    private DataAnalysisFacade dataAnalysisProcessor;

    // Constructor for the DataAnalysisManager class
    public DataAnalysisManager(DataCollectionService dataCollectionService,
                               DataPreprocessingService dataPreprocessingService,
                               AnalysisAlgorithmService analysisAlgorithmService,
                               VisualizationService visualizationService) {
        dataAnalysisProcessor = new DataAnalysisFacade(dataCollectionService, dataPreprocessingService, analysisAlgorithmService, visualizationService);
    }

    // The performFullAnalysis method provides a simplified interface for performing data analysis.
    public AnalysisResult performFullAnalysis(DataCollectionParams collectionParams,
                                              PreprocessingOptions preprocessingOptions,
                                              AnalysisAlgorithmConfig algorithmConfig) {
        return dataAnalysisProcessor.process(collectionParams, preprocessingOptions, algorithmConfig);
    }
}

