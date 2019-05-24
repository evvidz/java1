/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab06;

import java.util.Objects;

/**
 *
 * @author 1710510
 */
public class Lab06 {
    static public void main(String[] args) {
        Cylinder cylinder = new Cylinder(
                12,
                36,
                58,                
        );
        Cone cone = new Cone(
                14,
                47,
                49,                
        );
        Prism prism = new Prism(
                25,
                43,
                63,                
        );
        System.out.printf(cylinder.toString());
        System.out.printf(cone.toString());
        System.out.printf(prism.toString());
}
    static abstract class bodyShape {
        private int baseArea;
        private int volume;
        private int squareSurface;

        public bodyShape(int baseArea, int volume, int squareSurface) {
            this.baseArea = baseArea;
            this.volume = volume;
            this.squareSurface = squareSurface;        
        }
        
        public abstract String getType();
        
       
        public int getBaseArea() {
            return baseArea;
        }

        public void setBaseArea(int baseArea) {
            this.baseArea = baseArea;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

        public int getSquareSurface() {
            return squareSurface;
        }

        public void setSquareSurface(int squareSurface) {
            this.squareSurface = squareSurface;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 41 * hash + this.baseArea;
            hash = 41 * hash + this.volume;
            hash = 41 * hash + this.squareSurface;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final bodyShape other = (bodyShape) obj;
            if (this.cores != other.baseArea) {
                return false;
            }
            if (this.ram != other.volume) {
                return false;
            }
            if (this.hdd != other.squareSurface) {
                return false;
            }            
            return true;
        }

        @Override
        public String toString() {
            return "\n" + "Тип: " + getType() + "\n" +
                    "Площа основи: " + getBaseArea() + "см2\n" +
                    "Об'єм: " + getVolume() + " см3\n" +
                    "Площа бічної поверхні: " + getSquareSurface() + " см2\n";
        }
    }
    
    static class Cylinder extends Computer {
        private String DevType = "Циліндр";

        public Cylinder(int baseArea, int volume, int squareSurface) {
            super(baseArea, volume, squareSurface);
        }
        
        @Override
        public String getType() {
            return DevType;
        }
    }
    
    static class Cone extends Computer {
        private String DevType = "Конус";

        public Cone(int baseArea, int volume, int squareSurface) {
            super(baseArea, volume, squareSurface);
        }
        
        @Override
        public String getType() {
            return DevType;
        }
    }
    
    static class Prism extends Computer {
        private String DevType = "Призма";
        
        public Prism(int baseArea, int volume, int squareSurface) {
            super(baseArea, volume, squareSurface);
        }
        
        @Override
        public String getType() {
            return DevType;
        }
    }
}