package com.xworkz.car.bridge;

import com.xworkz.car.internal.*;

public interface InventorySystem {
    CarModel CarModel(CarModel carModel);
    EngineSpecs EngineSpecs(EngineSpecs engineSpecs);
    AssemblyLine AssemblyLine(AssemblyLine assemblyLine);
    QualityCheck QualityCheck(QualityCheck qualityCheck);
    PaintFinish PaintFinish(PaintFinish paintFinish);
}
