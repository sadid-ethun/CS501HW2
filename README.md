# CS501HW2

## Declarative vs Imperative UI (Jetpack Compose)

- What makes Compose declarative?
	- Compose is declarative because you describe what the UI should look like based on state, not how to update it step by step. When the state changes, Compose automatically does the UI again to match the new state. There is no manual refresh or view update code.

- Where is state stored?
	- State is stored in the parent composable `DashboardScreen` using `remember { mutableStateOf(...) }`. In this app, the `name` variable is the state, and it controls what text is shown on screen.

- Which composables are stateful vs stateless?
	- Stateful: `DashboardScreen` (owns and updates `name`).
	- Stateless: `Greeting`, `FilledButton` (They get data and callbacks through parameters and don't store state.)

- How does this differ from XML + View logic?
	- With XML and Views, UI is defined in XML and needs to be updated manually using listeners and `findViewById`. Developers have to explicitly change views when data changes.
	- With Compose, UI and logic are combined together in Kotlin, and UI updates automatically when the state changes, making the code more simple with fewer errors.
    
