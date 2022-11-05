#!/bin/sh

mvn clean install -DskipTests jib:dockerBuild
