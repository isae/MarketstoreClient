#!/bin/sh
docker create --name mktsdb -p 5993:5993 alpacamarkets/marketstore:latest
docker cp mkts.yml mktsdb:/etc/mkts.yml
docker start -i mktsdb
