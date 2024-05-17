package com.practice.Assignments.lld2.day140adapterandfacade.facadedata;

import com.practice.Assignments.lld2.day140adapterandfacade.facadedata.models.*;
import com.practice.Assignments.lld2.day140adapterandfacade.facadedata.services.AnalysisAlgorithmService;
import com.practice.Assignments.lld2.day140adapterandfacade.facadedata.services.DataCollectionService;
import com.practice.Assignments.lld2.day140adapterandfacade.facadedata.services.DataPreprocessingService;
import com.practice.Assignments.lld2.day140adapterandfacade.facadedata.services.VisualizationService;

public class DataAnalysisFacade {
    // References to various services
    private DataCollectionService dataCollectionService;
    private DataPreprocessingService dataPreprocessingService;
    private AnalysisAlgorithmService analysisAlgorithmService;
    private VisualizationService visualizationService;

    // Constructor for the DataAnalysisProcessor class
    public DataAnalysisFacade(DataCollectionService dataCollectionService,
                              DataPreprocessingService dataPreprocessingService,
                              AnalysisAlgorithmService analysisAlgorithmService,
                              VisualizationService visualizationService) {
        this.dataCollectionService = dataCollectionService;
        this.dataPreprocessingService = dataPreprocessingService;
        this.analysisAlgorithmService = analysisAlgorithmService;
        this.visualizationService = visualizationService;
    }

    // The process method provides a simplified interface for performing data analysis.
    public AnalysisResult process(DataCollectionParams collectionParams,
                                  PreprocessingOptions preprocessingOptions,
                                  AnalysisAlgorithmConfig algorithmConfig) {
        // Step 1: Collect data
        DataCollectionResult collectionResult = dataCollectionService.collectData(collectionParams);

        // Step 2: Preprocess data
        PreprocessedData preprocessedData = dataPreprocessingService.preprocessData(collectionResult.getData(), preprocessingOptions);

        // Step 3: Apply analysis algorithms
        AnalysisResult analysisResult = analysisAlgorithmService.applyAnalysisAlgorithms(preprocessedData, algorithmConfig);

        // Step 4: Visualize results
        visualizationService.visualizeResults(analysisResult);

        return analysisResult;
    }
}
