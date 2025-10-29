package com.xworkz.car.external;

import com.xworkz.car.bridge.*;
import com.xworkz.car.internal.*;

public class ManufacturingRunner {
    public static void main(String[] args) {
        CarModel model = new CarModel("Speedster X", 2026);
        EngineSpecs engine = new EngineSpecs(19876543210L, "V8 Turbo");
        AssemblyLine line = new AssemblyLine(5, "Maria Sanchez");
        QualityCheck qc = new QualityCheck(98, "David Lee");
        PaintFinish paint = new PaintFinish("R12-A", "Metallic Red");

        ProductionLine production = new ProductionLineImpl();
        System.out.println("\n--- Testing ProductionLineImpl ---");
        production.CarModel(model);
        production.EngineSpecs(engine);
        production.AssemblyLine(line);
        production.QualityCheck(qc);
        production.PaintFinish(paint);
        System.out.println("---------------------------------");

        DesignSpec design = new DesignSpecImpl();
        System.out.println("\n--- Testing DesignSpecImpl ---");
        design.CarModel(model);
        design.EngineSpecs(engine);
        design.AssemblyLine(line);
        design.QualityCheck(qc);
        design.PaintFinish(paint);
        System.out.println("---------------------------------");

        QAProcess qa = new QAProcessImpl();
        System.out.println("\n--- Testing QAProcessImpl ---");
        qa.CarModel(model);
        qa.EngineSpecs(engine);
        qa.AssemblyLine(line);
        qa.QualityCheck(qc);
        qa.PaintFinish(paint);
        System.out.println("---------------------------------");

        InventorySystem inventory = new InventorySystemImpl();
        System.out.println("\n--- Testing InventorySystemImpl ---");
        inventory.CarModel(model);
        inventory.EngineSpecs(engine);
        inventory.AssemblyLine(line);
        inventory.QualityCheck(qc);
        inventory.PaintFinish(paint);
        System.out.println("---------------------------------");

        LogisticsControl logistics = new LogisticsControlImpl();
        System.out.println("\n--- Testing LogisticsControlImpl ---");
        logistics.CarModel(model);
        logistics.EngineSpecs(engine);
        logistics.AssemblyLine(line);
        logistics.QualityCheck(qc);
        logistics.PaintFinish(paint);
        System.out.println("---------------------------------");
    }
}