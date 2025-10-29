package com.xworkz.car.bridge;

import com.xworkz.car.internal.*;

public class ProductionLineImpl implements ProductionLine {
    @Override
    public CarModel CarModel(CarModel carModel) {
        System.out.println("this is 1st sub class - Model: " + CarModel.modelName + ", Year: " + CarModel.year);
        return carModel;
    }
    @Override
    public EngineSpecs EngineSpecs(EngineSpecs engineSpecs) {
        System.out.println("this is 2nd sub class - Engine S/N: " + EngineSpecs.serialNumber + ", Type: " + EngineSpecs.engineType);
        return engineSpecs;
    }
    @Override
    public AssemblyLine AssemblyLine(AssemblyLine assemblyLine) {
        System.out.println("this is 3rd sub class - Station: " + AssemblyLine.stationNumber + ", Foreman: " + AssemblyLine.foremanName);
        return assemblyLine;
    }
    @Override
    public QualityCheck QualityCheck(QualityCheck qualityCheck) {
        System.out.println("this is 4th sub class - Score: " + QualityCheck.inspectionScore + ", Inspector: " + QualityCheck.inspectorName);
        return qualityCheck;
    }
    @Override
    public PaintFinish PaintFinish(PaintFinish paintFinish) {
        System.out.println("this is 5th sub class - Color Code: " + PaintFinish.colorCode + ", Type: " + PaintFinish.paintType);
        return paintFinish;
    }
}
