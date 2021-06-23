//https://www.androidhive.info/2016/10/android-working-with-firebase-realtime-database/


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;






mDatabase.child(userId).addValueEventListener(new ValueEventListener() {
    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
 
        User user = dataSnapshot.getValue(User.class);
 
        Log.d(TAG, "User name: " + user.getName() + ", email " + user.getEmail());
    }
 
    @Override
    public void onCancelled(DatabaseError error) {
        // Failed to read value
        Log.w(TAG, "Failed to read value.", error.toException());
    }
});


//////project level

build.gradle
dependencies {
        classpath 'com.android.tools.build:gradle:2.2.0'
        classpath 'com.google.gms:google-services:3.0.0'
 
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
    


/// app level

app/build.gradle
dependencies {
    // Adding support library for this demo app
    compile 'com.android.support:design:24.2.1'
 
    compile 'com.google.firebase:firebase-database:9.6.1'
}
 
apply plugin: 'com.google.gms.google-services'
