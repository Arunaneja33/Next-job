import axios from 'axios';

const API_URL = "http://localhost:8080";

export const savePost = async (payload) => {
  try {
    const response = await axios.post(`${API_URL}/post`, payload);
    return response.data;
  } catch (error) {
    console.error("Error:", error.message);
    if (error.response) {
      // Server responded with a status other than 200 range
      return error.response.data;
    } else if (error.request) {
      // Request was made but no response was received
      console.error("Error Request:", error.request);
      return { message: "Server did not respond. Please try again later." };
    } else {
      // Something happened in setting up the request
      console.error("Error Message:", error.message);
      return { message: "An unexpected error occurred. Please try again later." };
    }
  }
}
