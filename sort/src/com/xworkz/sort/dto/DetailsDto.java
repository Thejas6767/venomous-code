package com.xworkz.sort.dto;

import java.util.Objects;

public class DetailsDto implements Comparable<DetailsDto>{
    private int id;
    private String name;

    public DetailsDto(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "DetailsDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetailsDto that = (DetailsDto) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }



@Override

    public int compareTo(DetailsDto o) {
        if (this.getId() > o.getId()){
            return 1;

        }
        else {
            return -1;
        }
    }
}


