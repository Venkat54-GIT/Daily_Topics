On Day-1
              ┌─────────────────────────────┐
              │   Source Code (ABC.java)    │
              └────────────┬────────────────┘
                           │
                javac (Compiler)
                           │
                           ▼
              ┌─────────────────────────────┐
              │   Bytecode (ABC.class)      │
              └────────────┬────────────────┘
                           │
                   java ABC (Launcher)
                           │
                           ▼
              ┌─────────────────────────────┐
              │   JVM Process Created        │
              └────────────┬────────────────┘
                           │
                           ▼
              ┌─────────────────────────────┐
              │   ClassLoader Subsystem     │
              │  - Bootstrap loads core     │
              │  - AppLoader loads ABC.class│
              └────────────┬────────────────┘
                           │
                    Linking & Init
            (verify → prepare → resolve → init)
                           │
                           ▼
              ┌─────────────────────────────┐
              │   Runtime Data Areas         │
              │  • Method Area               │
              │  • Heap                      │
              │  • Stack (per thread)        │
              │  • PC Register               │
              │  • Native Method Stack       │
              └────────────┬────────────────┘
                           │
                           ▼
              ┌─────────────────────────────┐
              │  Execution Engine            │
              │  • Interpreter executes BC   │
              │  • JIT compiles hot code     │
              │  • Invokes native methods    │
              └────────────┬────────────────┘
                           │
                 Object Creation in Heap
                           │
                 GC runs periodically
                           │
                           ▼
              ┌─────────────────────────────┐
              │  Program Completion          │
              │  - main() frame removed      │
              │  - Non-daemon threads end    │
              │  - GC final cleanup          │
              │  - JVM shutdown hooks run    │
              └────────────┬────────────────┘
                           │
                           ▼
              ┌─────────────────────────────┐
              │     JVM Process Ends         │
              └─────────────────────────────┘
