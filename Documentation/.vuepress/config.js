// /.vuepress/config.js

module.exports = {
    title: 'The Redaction Programming Language',

    themeConfig: {
        search: false,
        displayAllHeaders: true,
        smoothScroll: true,

        sidebar: [
          ['/','Home'],
          '/Motivations',
          ['/Language-Features.md','Language Features'],
          '/Syntax',
          ['/Installation-and-Usage.md','Installation and Usage'],
          ['About-Us.md','About Us'],
        ]
      },
    
    markdown: {
        anchor: { permalink: true, permalinkBefore: true, permalinkSymbol: '' }   
    }
}