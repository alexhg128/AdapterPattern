if(![IO.Directory]::Exists( (Join-Path (Get-Location) 'dist') )) {
    mkdir dist | Out-Null
}
kotlinc src -include-runtime -d dist/program.jar
if($?) {
    Write-Host ""
    Write-Host "========== BUILD SUCCESFUL ============" -ForegroundColor Green
    Write-Host ""
    Write-Host "           Running program             " -ForegroundColor Green
    Write-Host ""
    Write-Host "=======================================" -ForegroundColor Green
    Write-Host ""
    java -jar dist/program.jar
    Write-Host ""
}
else {
    Write-Host ""
    Write-Host "============ BUILD ERROR ==============" -ForegroundColor Red
    Write-Host ""
}