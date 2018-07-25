# Dropwizard - Jib Example

## Jib Specific Configuration
### Adding files to the image
- INCUBATING FEATURE: places files in src/main/jib.  It'll appear on the file system as laid out

## Setting environment flags
- use the JAVA_TOOL_OPTIONS (depending on image)
-- example JAVA_TOOL_OPTIONS=-Xmx500m -XX:+PrintFlagsFinal