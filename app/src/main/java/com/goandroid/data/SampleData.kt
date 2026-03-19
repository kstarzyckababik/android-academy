package com.goandroid.data

import com.goandroid.domain.model.Category
import com.goandroid.domain.model.Question
import com.goandroid.domain.model.Subcategory

object SampleData {

    val categories = listOf(
        // 1. Kotlin Loops
        Category(
            id = 1,
            name = "Kotlin Loops",
            subcategories = listOf(
                Subcategory(
                    id = 1,
                    name = "For Loop",
                    questions = listOf(
                        Question(
                            id = 1,
                            question = "What does a 'for' loop do in Kotlin?",
                            answers = listOf(
                                "Defines a function",
                                "Iterates over a range or collection",
                                "Handles exceptions",
                                "Creates a class"
                            ),
                            correctAnswerIndex = 1
                        )
                    )
                ),
                Subcategory(
                    id = 2,
                    name = "While Loop",
                    questions = listOf(
                        Question(
                            id = 2,
                            question = "When is a 'while' loop used?",
                            answers = listOf(
                                "To catch exceptions",
                                "To declare variables",
                                "When you want to iterate while a condition is true",
                                "To create an object"
                            ),
                            correctAnswerIndex = 2
                        )
                    )
                ),
                Subcategory(
                    id = 3,
                    name = "Repeat Loop",
                    questions = listOf(
                        Question(
                            id = 3,
                            question = "What does 'repeat(n) { … }' do?",
                            answers = listOf(
                                "Initializes a list",
                                "Defines a coroutine",
                                "Repeats until a condition is false",
                                "Repeats the block n times"
                            ),
                            correctAnswerIndex = 3
                        )
                    )
                )
            )
        ),

        // 2. Kotlin Collections
        Category(
            id = 2,
            name = "Kotlin Collections",
            subcategories = listOf(
                Subcategory(
                    id = 4,
                    name = "Lists",
                    questions = listOf(
                        Question(
                            id = 4,
                            question = "Which collection is immutable by default?",
                            answers = listOf(
                                "List",
                                "MutableList",
                                "ArrayList",
                                "HashMap"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                ),
                Subcategory(
                    id = 5,
                    name = "Sets",
                    questions = listOf(
                        Question(
                            id = 5,
                            question = "What is a Set in Kotlin?",
                            answers = listOf(
                                "A key-value collection",
                                "A collection with unique elements",
                                "A list that allows duplicates",
                                "A loop structure"
                            ),
                            correctAnswerIndex = 1
                        )
                    )
                ),
                Subcategory(
                    id = 6,
                    name = "Maps",
                    questions = listOf(
                        Question(
                            id = 6,
                            question = "What is a Map in Kotlin?",
                            answers = listOf(
                                "A key-value pair collection",
                                "A loop type",
                                "A mutable list",
                                "A coroutine builder"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                )
            )
        ),

        // 3. Kotlin Advanced
        Category(
            id = 3,
            name = "Kotlin Advanced",
            subcategories = listOf(
                Subcategory(
                    id = 7,
                    name = "Extension Functions",
                    questions = listOf(
                        Question(
                            id = 7,
                            question = "What is an extension function in Kotlin?",
                            answers = listOf(
                                "Adds functionality to a class without inheriting it",
                                "Overrides a superclass method",
                                "Defines a new class",
                                "Creates a coroutine"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                ),
                Subcategory(
                    id = 8,
                    name = "Generics",
                    questions = listOf(
                        Question(
                            id = 8,
                            question = "Why use generics in Kotlin?",
                            answers = listOf(
                                "To create type-safe reusable code",
                                "To launch coroutines",
                                "To define UI layouts",
                                "To create enums"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                ),
                Subcategory(
                    id = 9,
                    name = "Sealed Classes",
                    questions = listOf(
                        Question(
                            id = 9,
                            question = "What is a sealed class used for?",
                            answers = listOf(
                                "Restricting class hierarchies and exhaustive when statements",
                                "Defining a database entity",
                                "Handling exceptions",
                                "Creating threads"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                )
            )
        ),

        // 4. Coroutines
        Category(
            id = 4,
            name = "Coroutines",
            subcategories = listOf(
                Subcategory(
                    id = 10,
                    name = "Basics",
                    questions = listOf(
                        Question(
                            id = 10,
                            question = "Which coroutine builder runs asynchronously and returns a Deferred?",
                            answers = listOf(
                                "async",
                                "launch",
                                "repeat",
                                "runBlocking"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                ),
                Subcategory(
                    id = 11,
                    name = "Flow",
                    questions = listOf(
                        Question(
                            id = 11,
                            question = "What does 'flow' represent?",
                            answers = listOf(
                                "A cold asynchronous data stream",
                                "A UI component",
                                "A database table",
                                "A loop type"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                ),
                Subcategory(
                    id = 12,
                    name = "Cancellation",
                    questions = listOf(
                        Question(
                            id = 12,
                            question = "How can you cancel a coroutine?",
                            answers = listOf(
                                "Call cancel() on the Job",
                                "Use a for loop",
                                "Delete the object",
                                "Call finish() on a class"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                )
            )
        ),

        // 5. Compose UI
        Category(
            id = 5,
            name = "Compose UI",
            subcategories = listOf(
                Subcategory(
                    id = 13,
                    name = "Basics",
                    questions = listOf(
                        Question(
                            id = 13,
                            question = "What is @Composable used for?",
                            answers = listOf(
                                "To mark a function as a UI builder",
                                "To handle database",
                                "To launch coroutines",
                                "To define a class"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                ),
                Subcategory(
                    id = 14,
                    name = "State",
                    questions = listOf(
                        Question(
                            id = 14,
                            question = "Which function preserves state across recompositions?",
                            answers = listOf(
                                "mutableStateOf",
                                "remember",
                                "launch",
                                "flow"
                            ),
                            correctAnswerIndex = 1
                        )
                    )
                ),
                Subcategory(
                    id = 15,
                    name = "Layouts",
                    questions = listOf(
                        Question(
                            id = 15,
                            question = "Which Compose component allows layering children on top of each other?",
                            answers = listOf(
                                "Column",
                                "Box",
                                "Row",
                                "Card"
                            ),
                            correctAnswerIndex = 1
                        )
                    )
                )
            )
        ),

        // 6. UI & Material Design
        Category(
            id = 6,
            name = "UI & Material Design",
            subcategories = listOf(
                Subcategory(
                    id = 16,
                    name = "Themes & Colors",
                    questions = listOf(
                        Question(
                            id = 16,
                            question = "What is the primary use of themes in Compose?",
                            answers = listOf(
                                "To style UI consistently",
                                "To define coroutines",
                                "To access databases",
                                "To create sealed classes"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                ),
                Subcategory(
                    id = 17,
                    name = "Typography",
                    questions = listOf(
                        Question(
                            id = 17,
                            question = "Which property defines text style in Compose?",
                            answers = listOf(
                                "MaterialTheme.typography",
                                "remember",
                                "Flow",
                                "NavController"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                ),
                Subcategory(
                    id = 18,
                    name = "Animations",
                    questions = listOf(
                        Question(
                            id = 18,
                            question = "Which Compose API is used for animations?",
                            answers = listOf(
                                "animate*AsState",
                                "LiveData",
                                "Room",
                                "CoroutineScope"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                )
            )
        ),

        // 7. State Management
        Category(
            id = 7,
            name = "State Management",
            subcategories = listOf(
                Subcategory(
                    id = 19,
                    name = "State hoisting",
                    questions = listOf(
                        Question(
                            id = 19,
                            question = "What is state hoisting?",
                            answers = listOf(
                                "Moving state up to a parent composable",
                                "Launching coroutines",
                                "Defining DAO interfaces",
                                "Creating sealed classes"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                ),
                Subcategory(
                    id = 20,
                    name = "ViewModel + State",
                    questions = listOf(
                        Question(
                            id = 20,
                            question = "Why use ViewModel with Compose?",
                            answers = listOf(
                                "To preserve UI state across configuration changes",
                                "To store animations",
                                "To create maps",
                                "To manage loops"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                ),
                Subcategory(
                    id = 21,
                    name = "remember vs rememberSaveable",
                    questions = listOf(
                        Question(
                            id = 21,
                            question = "Which remembers state across process death?",
                            answers = listOf(
                                "rememberSaveable",
                                "remember",
                                "mutableStateOf",
                                "launch"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                )
            )
        ),

        // 8. Data & Networking
        Category(
            id = 8,
            name = "Data & Networking",
            subcategories = listOf(
                Subcategory(
                    id = 22,
                    name = "Retrofit Basics",
                    questions = listOf(
                        Question(
                            id = 22,
                            question = "What is Retrofit used for?",
                            answers = listOf(
                                "Making HTTP requests",
                                "Defining UI",
                                "Managing coroutines",
                                "Creating a Room database"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                ),
                Subcategory(
                    id = 23,
                    name = "Serialization / JSON",
                    questions = listOf(
                        Question(
                            id = 23,
                            question = "Which library can serialize Kotlin data classes?",
                            answers = listOf(
                                "kotlinx.serialization",
                                "LiveData",
                                "Hilt",
                                "Flow"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                ),
                Subcategory(
                    id = 24,
                    name = "Caching / Room + Network",
                    questions = listOf(
                        Question(
                            id = 24,
                            question = "Why use repository pattern with Room + Network?",
                            answers = listOf(
                                "To separate data sources from UI",
                                "To animate UI elements",
                                "To launch coroutines",
                                "To manage navigation"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                )
            )
        ),

        // 9. Security & Permissions
        Category(
            id = 9,
            name = "Security & Permissions",
            subcategories = listOf(
                Subcategory(
                    id = 25,
                    name = "Runtime Permissions",
                    questions = listOf(
                        Question(
                            id = 25,
                            question = "When do you request runtime permissions?",
                            answers = listOf(
                                "When accessing camera or location",
                                "When launching a coroutine",
                                "When defining a sealed class",
                                "When creating UI"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                ),
                Subcategory(
                    id = 26,
                    name = "Secure Storage",
                    questions = listOf(
                        Question(
                            id = 26,
                            question = "Which is more secure than normal SharedPreferences?",
                            answers = listOf(
                                "EncryptedSharedPreferences",
                                "Room",
                                "Flow",
                                "MutableStateOf"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                ),
                Subcategory(
                    id = 27,
                    name = "ProGuard / R8",
                    questions = listOf(
                        Question(
                            id = 27,
                            question = "What is ProGuard / R8 used for?",
                            answers = listOf(
                                "Code minification and obfuscation",
                                "UI layout",
                                "Coroutine cancellation",
                                "Room migrations"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                )
            )
        ),

        // 10. Navigation
        Category(
            id = 10,
            name = "Navigation",
            subcategories = listOf(
                Subcategory(
                    id = 28,
                    name = "NavController",
                    questions = listOf(
                        Question(
                            id = 28,
                            question = "What is NavController used for?",
                            answers = listOf(
                                "To navigate between composables",
                                "To handle coroutines",
                                "To store data",
                                "To define themes"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                ),
                Subcategory(
                    id = 29,
                    name = "NavGraph",
                    questions = listOf(
                        Question(
                            id = 29,
                            question = "What is startDestination in NavGraph?",
                            answers = listOf(
                                "The first screen to show",
                                "A database table",
                                "A coroutine scope",
                                "A Compose modifier"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                )
            )
        ),

        // 11. Dependency Injection
        Category(
            id = 11,
            name = "Dependency Injection",
            subcategories = listOf(
                Subcategory(
                    id = 30,
                    name = "Hilt Basics",
                    questions = listOf(
                        Question(
                            id = 30,
                            question = "What does @HiltAndroidApp do?",
                            answers = listOf(
                                "Generates Hilt components for application",
                                "Defines a Room database",
                                "Creates a ViewModel",
                                "Launches a coroutine"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                ),
                Subcategory(
                    id = 31,
                    name = "Modules & Components",
                    questions = listOf(
                        Question(
                            id = 31,
                            question = "What is a Hilt Module used for?",
                            answers = listOf(
                                "To provide dependencies",
                                "To store UI state",
                                "To define a coroutine",
                                "To create a composable"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                )
            )
        ),

        // 12. Testing
        Category(
            id = 12,
            name = "Testing",
            subcategories = listOf(
                Subcategory(
                    id = 32,
                    name = "Unit Testing",
                    questions = listOf(
                        Question(
                            id = 32,
                            question = "What is tested in unit tests?",
                            answers = listOf(
                                "Logic of individual components",
                                "Full UI flow",
                                "Database migrations only",
                                "Animations"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                ),
                Subcategory(
                    id = 33,
                    name = "UI Testing",
                    questions = listOf(
                        Question(
                            id = 33,
                            question = "Which tool is used for Compose UI testing?",
                            answers = listOf(
                                "ComposeTestRule",
                                "JUnit4 only",
                                "Retrofit",
                                "Hilt"
                            ),
                            correctAnswerIndex = 0
                        )
                    )
                )
            )
        )
    )
}