{ pkgs }: {
    deps = [
      pkgs.adoptopenjdk-jre-openj9-bin-11
      pkgs.adoptopenjdk-jre-openj9-bin-8
      pkgs.adoptopenjdk-jre-bin
      pkgs.adoptopenjdk-jre-openj9-bin-15
      pkgs.jre_minimal
      pkgs.graalvm8-ce
      pkgs.graalvm11-ce
      pkgs.adoptopenjdk-openj9-bin-11
      pkgs.zulu8
        pkgs.azure-functions-core-tools
        pkgs.graalvm17-ce
        pkgs.maven
        pkgs.replitPackages.jdt-language-server
        pkgs.replitPackages.java-debug
    ];
}