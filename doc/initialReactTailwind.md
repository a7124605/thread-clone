Vite + React + Tailwind CSS v4.1 初始化指南
本文件指導如何初始化一個 Vite + React 專案，安裝 Tailwind CSS v4.1（使用 @tailwindcss/vite 插件），並啟動開發伺服器。適用於 Threads Clone 社交媒體平台 的前端初始化（階段 1，迭代 1.1）。
先決條件

test
Node.js：版本 16.x 或 18.x（建議使用 nvm 管理）。
npm：版本 8.x 或以上。
Git：用於版本控制。
終端機：macOS/Linux 的終端或 Windows 的 PowerShell/WSL。

步驟
1. 初始化 Vite 專案

創建專案目錄：
mkdir -p thread-clone/frontend
cd thread-clone/frontend


運行 Vite 初始化：
npm create vite@latest .


選擇框架：React
選擇變體：JavaScript
這將生成 Vite 專案結構：frontend/
├── src/
│   ├── App.jsx
│   ├── index.css
│   ├── main.jsx
│   └── assets/
├── public/
├── index.html
├── package.json
├── vite.config.js




安裝依賴：
npm install



2. 安裝 Tailwind CSS v4.1
Tailwind CSS v4.1 使用 @tailwindcss/vite 插件，無需 postcss 或 autoprefixer。

安裝 Tailwind CSS：
npm install -D tailwindcss @tailwindcss/vite


配置 Vite：

編輯 frontend/vite.config.js：import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'
import tailwindcss from '@tailwindcss/vite'

export default defineConfig({
  plugins: [
    react(),
    tailwindcss(),
  ],
})




導入 Tailwind CSS：

編輯 frontend/src/index.css：@import "tailwindcss";




（可選）自訂配置：

若需自訂，創建 frontend/tailwind.config.js：/** @type {import('tailwindcss').Config} */
export default {
  content: [
    "./index.html",
    "./src/**/*.{js,jsx}",
  ],
  theme: {
    extend: {
      colors: {
        custom: '#1a202c',
      },
    },
  },
  plugins: [],
}





3. 驗證 Tailwind CSS

測試樣式：

編輯 frontend/src/App.jsx：function App() {
  return (
    <div className="p-4 bg-blue-500 text-white">
      <h1 className="text-2xl font-bold">Hello, Tailwind CSS v4.1!</h1>
    </div>
  )
}




啟動開發伺服器：
npm run dev


訪問 http://localhost:5173，應顯示藍色背景和白字。



4. 提交更改

初始化 Git（若尚未）：
git init
echo "node_modules/\ndist/\n.env" > .gitignore


提交：
git add .
git commit -m "初始化 Vite + React 專案，安裝 Tailwind CSS v4.1"



常見問題

拼寫錯誤：確保使用 tailwindcss 而非 taliwindcss。
環境變數：若使用 Supabase，添加 frontend/.env：VITE_SUPABASE_URL=your-supabase-url
VITE_SUPABASE_ANON_KEY=your-supabase-anon-key


錯誤調試：
檢查 package.json 的 scripts 是否包含 "dev": "vite"。
若依賴缺失，運行 npm install。
查看日誌：~/.npm/_logs/。



下一步

配置 Supabase：安裝 @supabase/supabase-js 並創建 src/lib/supabase.js。
配置 ESLint 和 Prettier：確保程式碼一致性。
推進迭代 1.2：創建資料庫結構。

