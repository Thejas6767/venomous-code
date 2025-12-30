package com.xworkz.encapsulation.external;


import com.xworkz.encapsulation.dto.ArtifactDto;

public class ArtifactDtoRunner {
    public static void main(String[] args) {

        ArtifactDto artifact1 = new ArtifactDto("Golden Crown", 500, 1500000.0, true);
        ArtifactDto artifact2 = new ArtifactDto("Ancient Vase", 2000, 50000.0, false);
        ArtifactDto artifact3 = new ArtifactDto("Golden Crown", 500, 1500000.0, true);

        System.out.println(artifact1.toString());
        System.out.println(artifact2.toString());

        if (artifact1.equals(artifact3)) {
            System.out.println("Artifact 1 and 3 are the same rare items.");
        } else {
            System.out.println("These are different artifacts.");
        }

        if (artifact2.isAuthentic()) {
            System.out.println(artifact2.getArtifactName() + " is a genuine rare find.");
        } else {
            System.out.println(artifact2.getArtifactName() + " is a replica (not authentic).");
        }

        System.out.println("Hash of Artifact 1: " + artifact1.hashCode());
        System.out.println("Hash of Artifact 3: " + artifact3.hashCode());
    }
}