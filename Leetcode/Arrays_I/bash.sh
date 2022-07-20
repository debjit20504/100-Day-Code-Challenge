#!/bin/bash
read -p "Enter file name: " filename
javac $filename.java
java $filename.java
