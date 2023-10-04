# mule-termial-simulator
Simple app to let you execute command line in mule runtime

## Description

This is a simple app to let you execute command line in mule runtime

## Getting Started

### Dependencies

Deploy the app to any mule host options: on-prem, CloudHub 1.0, CloudHub 2.0, Runtime Fabric

### Executing program

* Get the app URL, the endpoint is /command
* Put your command into the request payload. E.g, print out OS environment variable:
```
{
    "command" : "printenv"
}
```

## Authors

Contributors names and contact info

Tim Dai  
https://www.linkedin.com/in/tim-liang-dai-a7968617

## Version History

* 0.1
    * Initial Release

