Write the code snippets for the following questions and upload the answer sheet
as a pdf file.

1. Create a new instance of a TextView called `myTextView` and set its text to
"Hello, World!" using the `onCreate()` method,

3. In the `onStart()` method, start a background service called `MyService` using
`startService()`.

5. In the `onResume()` method, register a BroadcastReceiver called `myReceiver`
to listen for the "MY_ACTION" intent action using `registerReceiver()` and by
using the `onPause()` method, unregister the previously registered
`myReceiver` using `unregisterReceiver()`.

7. In the `onStop()` method, save the value of an EditText called `myEditText` to
a variable `inputValue` using `getText().toString()`.

9. You are building a simple music player app that plays audio files. Implement
the lifecycle management of the audio player using the callback methods in an
Activity. Assume that the audio player is initialized and started in onCreate(),
and the audio playback is managed by an instance of the MediaPlayer class.

➢ In onCreate(), initialize the MediaPlayer instance and start playing a
default audio file.

➢ In onStart(), resume the audio playback if it was previously paused.

➢ In onPause(), unregister the broadcast receiver to stop listening and
pause the audio playback.

➢ In onStop(), stop the audio playback and release the MediaPlayer
instance.
