package com.javabackendsnippets.github.javabackendsnippets.MemoryManagement;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;

/**
 * <b>Heap Memory: </b>Heap memory is a region of memory in a computer's RAM (Random Access Memory) that is used for
 * dynamic memory allocation during the runtime of a program. In the context of programming languages like Java,
 * heap memory is a crucial component of memory management.
 */

public class HeapMemory {

    public void getUtilizedHeapMemorySize() {
        MemoryUsage heapMemoryUsage = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
        System.out.println("Used Heap Memory: " + heapMemoryUsage.getUsed() + " bytes");
    }


}
