package com.xworkz.bike.external;

import com.sun.xml.internal.ws.api.pipe.Engine;
import com.xworkz.bike.internal.CruiserBike;
import com.xworkz.bike.internal.OffRoadBike;
import com.xworkz.bike.internal.SportBike;
import com.xworkz.bike.internal.Tires;

import java.awt.*;

public class BikeRunner {
    public static void main(String[] args) {
        Engine sportEngine = new Engine("Inline-4", 999);
        Frame sportFrame = new Frame("Twin-Spar", "Aluminum");
        Tires sportTires = new Tires("Pirelli Diablo Rosso IV", "Pirelli Diablo Rosso IV");
        SportBike yamahaR1 = new SportBike("Yamaha", "YZF-R1", sportEngine, sportFrame, sportTires);

        Engine cruiserEngine = new Engine("V-twin", 1745);
        Frame cruiserFrame = new Frame("Single-Backbone", "Steel");
        Tires cruiserTires = new Tires("Michelin Scorcher", "Michelin Scorcher");
        CruiserBike harleyDavidson = new CruiserBike("Harley-Davidson", "Fat Bob", cruiserEngine, cruiserFrame, cruiserTires);

        Engine offRoadEngine = new Engine("Single-Cylinder", 450);
        Frame offRoadFrame = new Frame("Perimeter", "Aluminum");
        Tires offRoadTires = new Tires("Knobby Tire", "Knobby Tire");
        OffRoadBike hondaCRF = new OffRoadBike("Honda", "CRF450R", offRoadEngine, offRoadFrame, offRoadTires);

        yamahaR1.displayDetails();
        harleyDavidson.displayDetails();
        hondaCRF.displayDetails();
    }
}
