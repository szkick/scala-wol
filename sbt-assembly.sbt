import sbtassembly.Plugin
import sbtassembly.Plugin.AssemblyKeys._

Plugin.assemblySettings

mainClass in assembly := Some("com.szkick.wol.WakeOnLAN")
