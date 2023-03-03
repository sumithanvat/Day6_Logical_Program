package com.bridgelabz;

    public class StopWatch {
        private long startTime;
        private long endTime;
        private boolean isRunning;

        public void start() {
            if (isRunning) {
                throw new RuntimeException("Stopwatch is already running");
            }
            startTime = System.currentTimeMillis();
            isRunning = true;
        }

        public void stop() {
            if (!isRunning) {
                throw new RuntimeException("Stopwatch is not running");
            }
            endTime = System.currentTimeMillis();
            isRunning = false;
        }

        public long getElapsedTime() {
            if (isRunning) {
                throw new RuntimeException("Stopwatch is still running");
            }
            return endTime - startTime;
        }

        public static void main(String[] args) {
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            // Perform some task to be timed
            // ...
            stopWatch.stop();
            System.out.println("Elapsed time: " + stopWatch.getElapsedTime() + " ms");
        }
    }

