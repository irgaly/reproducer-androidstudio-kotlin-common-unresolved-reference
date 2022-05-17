reproducer of https://issuetracker.google.com/issues/232839441

# reproducer-androidstudio-kotlin-common-unresolved-reference

* `:feature:android` module is a Kotlin Multiplatform Android Library project
* `:feature:common` module is a Kotlin Multiplatform JVM project

then, `:feature:common`'s Classes are `Unresolved reference` from `:feature:android` module.

![image](https://user-images.githubusercontent.com/1311446/168754562-bca18d47-ff86-4440-b11e-323b215b341d.png)

# Android Studio version

```
Android Studio Electric Eel | 2022.1.1 Canary 2
Build #AI-213.7172.25.2211.8571212, built on May 11, 2022
Runtime version: 11.0.13+0-b1751.21-8125866 aarch64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
macOS 12.3.1
GC: G1 Young Generation, G1 Old Generation
Memory: 4096M
Cores: 8
Registry:
    external.system.auto.import.disabled=true
    ide.text.editor.with.preview.show.floating.toolbar=false
    ide.instant.shutdown=false

Non-Bundled Plugins:
    org.plugin.dot.id (1.4.1)
    com.dubreuia (2.3.0)
    IdeaVIM (1.10.2)
    Dart (213.7371)
    kotest-plugin-intellij (1.1.50-IC-213-EAP-SNAPSHOT)
    io.flutter (67.1.3)
```
