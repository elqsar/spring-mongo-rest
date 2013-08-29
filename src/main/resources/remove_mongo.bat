@echo off
set /p database=Enter database name to delete:
cd C:\mongo\mongodb-win32-x86_64-2.4.4\bin
mongo "%database%" --eval "db.dropDatabase()"
echo Deleting database...
pause
