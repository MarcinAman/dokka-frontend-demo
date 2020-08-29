config.module.rules.push(
    {
        test: /\.svg$/,
        loader: 'svg-inline-loader',
        options: {
            jsx: true // true outputs JSX tags
        }
    }
);