#!/usr/bin/env bash

latexmk -pvc -pdf -shell-escape -outdir=./out main.tex
