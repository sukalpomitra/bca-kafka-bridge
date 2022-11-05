#!/bin/sh

printStep() {
    # Colors.
    YELLOW='\033[1;33m'
    END='\033[0m'

    echo "\n==================================================================="
    echo "${YELLOW}STEP: ${END}$1"
    echo "==================================================================="
}

sh ./compile.sh

cd local

docker-compose up