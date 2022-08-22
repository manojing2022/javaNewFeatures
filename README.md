# javaNewFeatures
java features


 javac -d out -sourcepath src/main src/main/java/com/ing/example/FlightRecorder.java
 javac -d out -sourcepath src/main src/main/java/com/ing/example/HeapDump.java      
 javac -d out -sourcepath src/main src/main/java/com/ing/example/OutOfMemoryGCLimitExceed.java
 javac -d out -sourcepath src/main src/main/java/com/ing/example/ThreadDump.java              
 javac -d out -sourcepath src/main src/main/java/com/ing/example/VerboseGarbageCollectorRunner.java 


java -XX:StartFlightRecording=duration=2000s,filename=flight.jfr \
-cp ./out/ com.ing.example.FlightRecorder

java -XX:StartFlightRecording=duration=2000s,filename=heap.jfr \
-cp ./out/ com.ing.example.HeapDump

java -XX:StartFlightRecording=duration=2000s,filename=outOfMemory.jfr \
-cp ./out/ com.ing.example.OutOfMemoryGCLimitExceed

java -XX:StartFlightRecording=duration=2000s,filename=threadDump.jfr \
-cp ./out/ com.ing.example.ThreadDump

java -XX:StartFlightRecording=duration=2000s,filename=garbage.jfr \
-cp ./out/ com.ing.example.VerboseGarbageCollectorRunner
