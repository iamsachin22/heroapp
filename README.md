
# Heroapp

## Built with 🛠

- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - For asynchronous and more..
- [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/) - A cold asynchronous data stream that sequentially emits values and completes normally or with an exception.
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
  - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Data objects that notify views when the underlying database changes.
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes. 
  - [ViewBinding](https://developer.android.com/topic/libraries/view-binding) - Generates a binding class for each XML layout file present in that module and allows you to more easily write code that interacts with views.
  - [Room](https://developer.android.com/topic/libraries/architecture/room) - SQLite object mapping library.
  - [Navigation Component](https://developer.android.com/guide/navigation/navigation-getting-started) Navigation refers to the interactions that allow users to navigate across, into, and back out from the different pieces of content within your app.
    - [Safe args](https://developer.android.com/guide/navigation/navigation-pass-data#Safe-args) - Gradle plugin that provides type safety when navigating and passing data between destinations. 
- [DataStore](https://developer.android.com/topic/libraries/architecture/datastore) - Jetpack DataStore is a data storage solution that allows you to store key-value pairs or typed objects with protocol buffers.
- [Dependency Injection](https://developer.android.com/training/dependency-injection) - 
  - [Hilt-Dagger](https://dagger.dev/hilt/) - Standard library to incorporate Dagger dependency injection into an Android application.
  - [Hilt-ViewModel](https://developer.android.com/training/dependency-injection/hilt-jetpack) - DI for injecting `ViewModel`.
  - [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java.
- [Jetpack Compose UI Toolkit](https://developer.android.com/jetpack/compose) - Modern UI development toolkit.
- [Accompanist](https://google.github.io/accompanist/) - Accompanist is a group of libraries that aim to supplement Jetpack Compose with features that are commonly required by developers but not yet available.
- [Coil-compose](https://coil-kt.github.io/coil/compose/) - An image loading library for Android backed by Kotlin Coroutines.

## Architecture

This app uses [_**MVVM (Model View View-Model)**_](https://developer.android.com/jetpack/docs/guide#recommended-app-arch) architecture.
![MVVM-with-Clean-Architecture-for-your-Android-App](https://user-images.githubusercontent.com/84586226/178134386-16784bf9-f78d-498b-a1b2-0917ab191c3f.png)

<h3>Screenshots</h3>

<div class="row">
      <img src="https://user-images.githubusercontent.com/84586226/178134156-bf677c26-5c69-46d7-8a48-71531d4a9251.png" width="250" hspace="20">
      <img src="https://user-images.githubusercontent.com/84586226/178134154-e79cc648-eb8d-414a-8362-110ee400c49a.png" width="250" hspace="20">
</div>
<div class="row">
      <img src="https://user-images.githubusercontent.com/84586226/178134157-e691e8da-715f-4748-af48-2d86166c0211.png" width="250" hspace="20">
      <img src="https://user-images.githubusercontent.com/84586226/178134151-3bcb8ff3-d01e-4c42-94d2-b43bb0d4ddaf.png" width="250" hspace="20">
</div>

<div class="row">
      <img src="https://user-images.githubusercontent.com/84586226/178134159-2ea6007c-fe40-4fb8-813a-a8c22d5b95e4.png" width="250" hspace="20">
      <img src="https://user-images.githubusercontent.com/84586226/178134158-24695ae0-915d-4b02-be3a-4af04bd827c3.png" width="250" hspace="20">     
</div>

