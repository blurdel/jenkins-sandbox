
def readProperties() {
  def props = readProperties(file: 'server.properties')
  def project = props["project"]
  echo "pr: ${project}"
}

def getProperty(String key) {
  return props["${key}"]
}

return this
