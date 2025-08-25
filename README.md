# Portal Estipulante - Local setup

This workspace contains two folders:

- backend: Spring Boot application (port 8080)
- frontend: Vite + React (dev server default: 5173)

How to run / Falconi

1) Backend (requires JDK 17 and Maven):

```powershell
cd "C:\Falconi Workspace\FSFX Portal Estipulante Falconi\backend"
mvn spring-boot:run
```

2) Frontend (requires Node.js >=16 and npm):

```powershell
cd "C:\Falconi Workspace\FSFX Portal Estipulante Falconi\frontend"
npm install
npm run dev
```

Notes
- The frontend currently loads your original `Index2108.html` into the React app from `public/template.html`. You can progressively refactor the markup into React components in `src/`.
- Backend exposes simple endpoints: `/api/health`, `/api/beneficiaries`, `/api/login`.
