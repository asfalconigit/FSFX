import { defineConfig } from 'vite'

// Pin the dev server port to 5174 so the app and CORS are stable
export default defineConfig({
  server: {
    port: 5174
  }
})
