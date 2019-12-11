### Only python version of the API needs to be developed here
### How to read the dataset and API to develope is available in python folder
### Data is available in data folder

- Problem Details
  - Face detection and Recognition
    - There are 15 celebrities' images in "vision_hackathon_drive.zip" in respective folders.
    - Build a face detection and recognition model to detect a multi-face image such as in the validation set "vision_hackathon_drive_val.zip"
    - It is possible that some images might not contain any face.
      
- BONUS 
  - Run the model on a live video URL for real-time recognition and detection.
  
- Write the following API
  - Refer to the code of face_detector_live_video.py (for how to get frames of youtube live)
  - API for static images
    - def detect_and_draw_faces(image)

- Dataset 
  - Train set - 15 celebrities, Aprox 100 each
  - Test set - 8 images (multi-face)

- Evaluation
  - Manual evaluation on spot. If you come up with a metric, that's a bonus.
