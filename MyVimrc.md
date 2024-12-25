#### vim设置：

""颜色主题（^,^)
" 设置颜色主题
colorscheme  ron " desert 是 vim 默认的一个主题
""启用鼠标（^,^)
set  mouse=a
""基本设计（^,^)
" 显示行号
set number
" 启用语法高亮
syntax on
" 启用自动缩进
set autoindent
set smartindent
set tabstop=4        " 制表符宽度为4
set shiftwidth=4     " 自动缩进时使用4个空格
set expandtab        " 用空格代替制表符
"" 搜索设置（^,^)
" 搜索时忽略大小写，除非包含大写字母
set ignorecase
set smartcase

" 搜索时高亮匹配的结果
set hlsearch

" 在输入搜索内容时实时显示匹配结果
set incsearch
""鼠标设置（^,^)
" 启用鼠标支持
set mouse=a
""增强状态栏（^,^)
" 显示增强的状态栏信息
set laststatus=2
" 突出显示当前行
set cursorline
""编译并执行（^,^）
" 定义快捷键 F5 编译并运行当前 C++ 文件
autocmd FileType cpp nnoremap <F5> :w<CR>:!g++ % -o %:r && ./%:r<CR>
""快捷键设置
" 将 jj 设置为快速返回正常模式
let mapleader = " "
inoremap jj <Esc>

" 快速保存文件
nnoremap <leader>w :w<CR>

" 快速关闭文件
nnoremap <leader>q :q<CR>

""打印c++模板（^,^）
" C++ 模板缩写
autocmd FileType cpp inoreabbrev t11   <C-R>=CppTemplate()<CR>

function! CppTemplate()
    return "/*\n * Author: Your Name\n * Date: " . strftime("%Y-%m-%d") . "\n */\n\n#include <iostream>\nusing namespace std;\n\nint main() {\n    // Your code here\n    return 0;\n}"
endfunction