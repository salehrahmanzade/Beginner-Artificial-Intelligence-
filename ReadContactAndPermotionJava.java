
if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) 
        == PackageManager.PERMISSION_GRANTED) {
    // Permission is granted
} else {
    // Permission is not granted
}

ActivityCompat.requestPermissions(this, 
        new String[]{Manifest.permission.CAMERA}, 
        REQUEST_CODE);

@Override
public void onRequestPermissionsResult(int requestCode, 
                                       @NonNull String[] permissions, 
                                       @NonNull int[] grantResults) {
    if (requestCode == REQUEST_CODE) {
        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            // Permission granted
        } else {
            // Permission denied
        }
    }
}

if (!ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CAMERA)) {
    // Redirect to app settings
}