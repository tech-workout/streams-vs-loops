package com.workout.streams.loop;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Warmup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class App {

  @Benchmark
  @Fork(value = 1)
  @Warmup(iterations = 2, time = 1, timeUnit = TimeUnit.SECONDS)
  @BenchmarkMode(Mode.SampleTime)
  @Measurement(iterations = 1)
  public void init() {
    System.out.println("Hello world");
  }

  public static void main(String[] args) {
    try {
      org.openjdk.jmh.Main.main(args);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
