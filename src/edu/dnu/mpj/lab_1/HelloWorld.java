package edu.dnu.mpj.lab_1;

import mpi.MPI;

/**
 * Created with IntelliJ IDEA.
 * User: Den_dp
 * Date: 12.10.12
 * Time: 21:55
 */
public class HelloWorld {
    public static void main(String[] args) {
        MPI.Init(args);
        int me = MPI.COMM_WORLD.Rank();
        int size = MPI.COMM_WORLD.Size();
        System.out.println("Hi peps from process#"+me+" ("+size+")");
        MPI.Finalize();
    }
}
