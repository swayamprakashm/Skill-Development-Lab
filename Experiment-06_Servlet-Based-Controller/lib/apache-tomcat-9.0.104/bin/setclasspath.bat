<<<<<<< HEAD
@echo off
rem Licensed to the Apache Software Foundation (ASF) under one or more
rem contributor license agreements.  See the NOTICE file distributed with
rem this work for additional information regarding copyright ownership.
rem The ASF licenses this file to You under the Apache License, Version 2.0
rem (the "License"); you may not use this file except in compliance with
rem the License.  You may obtain a copy of the License at
rem
rem     http://www.apache.org/licenses/LICENSE-2.0
rem
rem Unless required by applicable law or agreed to in writing, software
rem distributed under the License is distributed on an "AS IS" BASIS,
rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
rem See the License for the specific language governing permissions and
rem limitations under the License.

rem ---------------------------------------------------------------------------
rem Set JAVA_HOME or JRE_HOME if not already set, ensure any provided settings
rem are valid and consistent with the selected start-up options and set up the
rem endorsed directory.
rem ---------------------------------------------------------------------------

rem Make sure prerequisite environment variables are set

rem In debug mode we need a real JDK (JAVA_HOME)
if ""%1"" == ""debug"" goto needJavaHome

rem Otherwise either JRE or JDK are fine
if not "%JRE_HOME%" == "" goto gotJreHome
if not "%JAVA_HOME%" == "" goto gotJavaHome
echo Neither the JAVA_HOME nor the JRE_HOME environment variable is defined
echo At least one of these environment variable is needed to run this program
goto exit

:needJavaHome
rem Check if we have a usable JDK
if "%JAVA_HOME%" == "" goto noJavaHome
if not exist "%JAVA_HOME%\bin\java.exe" goto noJavaHome
if not exist "%JAVA_HOME%\bin\jdb.exe" goto noJavaHome
if not exist "%JAVA_HOME%\bin\javac.exe" goto noJavaHome
set "JRE_HOME=%JAVA_HOME%"
goto okJava

:noJavaHome
echo The JAVA_HOME environment variable is not defined correctly.
echo JAVA_HOME=%JAVA_HOME%
echo It is needed to run this program in debug mode.
echo NB: JAVA_HOME should point to a JDK not a JRE.
goto exit

:gotJavaHome
rem No JRE given, check if JAVA_HOME is usable as JRE_HOME
if not exist "%JAVA_HOME%\bin\java.exe" goto noJavaHomeAsJre
rem Use JAVA_HOME as JRE_HOME
set "JRE_HOME=%JAVA_HOME%"
goto okJava

:noJavaHomeAsJre
echo The JAVA_HOME environment variable is not defined correctly.
echo JAVA_HOME=%JAVA_HOME%
echo NB: JAVA_HOME should point to a JDK not a JRE.
goto exit

:gotJreHome
rem Check if we have a usable JRE
if not exist "%JRE_HOME%\bin\java.exe" goto noJreHome
goto okJava

:noJreHome
rem Needed at least a JRE
echo The JRE_HOME environment variable is not defined correctly
echo JRE_HOME=%JRE_HOME%
echo This environment variable is needed to run this program
goto exit

:okJava
rem Don't override the endorsed dir if the user has set it previously
if not "%JAVA_ENDORSED_DIRS%" == "" goto gotEndorseddir
rem Java 9 no longer supports the java.endorsed.dirs
rem system property. Only try to use it if
rem CATALINA_HOME/endorsed exists.
if not exist "%CATALINA_HOME%\endorsed" goto gotEndorseddir
set "JAVA_ENDORSED_DIRS=%CATALINA_HOME%\endorsed"
:gotEndorseddir

rem Don't override _RUNJAVA if the user has set it previously
if not "%_RUNJAVA%" == "" goto gotRunJava
rem Set standard command for invoking Java.
rem Also note the quoting as JRE_HOME may contain spaces.
set "_RUNJAVA=%JRE_HOME%\bin\java.exe"
:gotRunJava

rem Don't override _RUNJDB if the user has set it previously
rem Also note the quoting as JAVA_HOME may contain spaces.
if not "%_RUNJDB%" == "" goto gotRunJdb
set "_RUNJDB=%JAVA_HOME%\bin\jdb.exe"
:gotRunJdb

goto end

:exit
exit /b 1

:end
exit /b 0
=======
@echo off
rem Licensed to the Apache Software Foundation (ASF) under one or more
rem contributor license agreements.  See the NOTICE file distributed with
rem this work for additional information regarding copyright ownership.
rem The ASF licenses this file to You under the Apache License, Version 2.0
rem (the "License"); you may not use this file except in compliance with
rem the License.  You may obtain a copy of the License at
rem
rem     http://www.apache.org/licenses/LICENSE-2.0
rem
rem Unless required by applicable law or agreed to in writing, software
rem distributed under the License is distributed on an "AS IS" BASIS,
rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
rem See the License for the specific language governing permissions and
rem limitations under the License.

rem ---------------------------------------------------------------------------
rem Set JAVA_HOME or JRE_HOME if not already set, ensure any provided settings
rem are valid and consistent with the selected start-up options and set up the
rem endorsed directory.
rem ---------------------------------------------------------------------------

rem Make sure prerequisite environment variables are set

rem In debug mode we need a real JDK (JAVA_HOME)
if ""%1"" == ""debug"" goto needJavaHome

rem Otherwise either JRE or JDK are fine
if not "%JRE_HOME%" == "" goto gotJreHome
if not "%JAVA_HOME%" == "" goto gotJavaHome
echo Neither the JAVA_HOME nor the JRE_HOME environment variable is defined
echo At least one of these environment variable is needed to run this program
goto exit

:needJavaHome
rem Check if we have a usable JDK
if "%JAVA_HOME%" == "" goto noJavaHome
if not exist "%JAVA_HOME%\bin\java.exe" goto noJavaHome
if not exist "%JAVA_HOME%\bin\jdb.exe" goto noJavaHome
if not exist "%JAVA_HOME%\bin\javac.exe" goto noJavaHome
set "JRE_HOME=%JAVA_HOME%"
goto okJava

:noJavaHome
echo The JAVA_HOME environment variable is not defined correctly.
echo JAVA_HOME=%JAVA_HOME%
echo It is needed to run this program in debug mode.
echo NB: JAVA_HOME should point to a JDK not a JRE.
goto exit

:gotJavaHome
rem No JRE given, check if JAVA_HOME is usable as JRE_HOME
if not exist "%JAVA_HOME%\bin\java.exe" goto noJavaHomeAsJre
rem Use JAVA_HOME as JRE_HOME
set "JRE_HOME=%JAVA_HOME%"
goto okJava

:noJavaHomeAsJre
echo The JAVA_HOME environment variable is not defined correctly.
echo JAVA_HOME=%JAVA_HOME%
echo NB: JAVA_HOME should point to a JDK not a JRE.
goto exit

:gotJreHome
rem Check if we have a usable JRE
if not exist "%JRE_HOME%\bin\java.exe" goto noJreHome
goto okJava

:noJreHome
rem Needed at least a JRE
echo The JRE_HOME environment variable is not defined correctly
echo JRE_HOME=%JRE_HOME%
echo This environment variable is needed to run this program
goto exit

:okJava
rem Don't override the endorsed dir if the user has set it previously
if not "%JAVA_ENDORSED_DIRS%" == "" goto gotEndorseddir
rem Java 9 no longer supports the java.endorsed.dirs
rem system property. Only try to use it if
rem CATALINA_HOME/endorsed exists.
if not exist "%CATALINA_HOME%\endorsed" goto gotEndorseddir
set "JAVA_ENDORSED_DIRS=%CATALINA_HOME%\endorsed"
:gotEndorseddir

rem Don't override _RUNJAVA if the user has set it previously
if not "%_RUNJAVA%" == "" goto gotRunJava
rem Set standard command for invoking Java.
rem Also note the quoting as JRE_HOME may contain spaces.
set "_RUNJAVA=%JRE_HOME%\bin\java.exe"
:gotRunJava

rem Don't override _RUNJDB if the user has set it previously
rem Also note the quoting as JAVA_HOME may contain spaces.
if not "%_RUNJDB%" == "" goto gotRunJdb
set "_RUNJDB=%JAVA_HOME%\bin\jdb.exe"
:gotRunJdb

goto end

:exit
exit /b 1

:end
exit /b 0
>>>>>>> 10b5e9fbd590dd7b6eef73f6e5e409277d3db61f
