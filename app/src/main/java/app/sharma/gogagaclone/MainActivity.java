package app.sharma.gogagaclone;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
//        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.nav_match, R.id.nav_chats, R.id.nav_notification, R.id.nav_settings)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(navView, navController);
//        actionBar = getSupportActionBar();
//        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

//    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            Fragment fragment;
//            switch (item.getItemId()) {
//                case R.id.nav_match:
//                    actionBar.setTitle("Match");
//                    fragment = new MatchFragment();
//                    loadFragment(fragment);
//                    return true;
//                case R.id.nav_chats:
//                    actionBar.setTitle("Chats");
//                    fragment = new ChatFragment();
//                    loadFragment(fragment);
//                    return true;
//                case R.id.nav_notification:
//                    actionBar.setTitle("Notification");
//                    fragment = new NotificationFragment();
//                    loadFragment(fragment);
//                    return true;
//                case R.id.nav_settings:
//                    actionBar.setTitle("Settings");
//                    fragment = new SettingsFragment();
//                    loadFragment(fragment);
//                    return true;
//            }
//            return false;
//        }
//    };
//    private void loadFragment(Fragment fragment) {
//        // load fragment
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.replace(R.id.nav_host_fragment, fragment);
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }

}