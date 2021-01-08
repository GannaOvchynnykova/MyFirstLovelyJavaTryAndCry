#!/bin/bash
for i in {1..10}
do
    mkdir ./lesson-$i
    mkdir ./lesson-$i/homework
    touch /lesson-$i/homework-task.md
    echo "Hello magic programing $i" >> /lesson-$i/homework-task.md
    echo "lesson-"$i
done