//** This class represents mathematical object called vector it has */
package org.example;

import static java.lang.Math.sqrt;

public class Vector {
    int x;
    int y;
    int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    int length() { return (int) sqrt(sqrt(x) + sqrt(y) + sqrt(z)); }

    int scalarProduct(Vector vector) {
        return x*vector.x + y*vector.y + z*vector.z;
    }

    Vector vectorProduct(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }


    public Vector subtract(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }

    public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];
        for(int i =0; i < n; i++){
            vectors[i] = new Vector((int) Math.random(), (int) Math.random(), (int) Math.random());
        }
        return vectors;
    }
}
