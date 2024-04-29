@echo off
cd /d %~dp0
java --module-path ".\javafx-sdk-22\lib" --add-modules javafx.controls,javafx.fxml -jar shabat.jar
pause
