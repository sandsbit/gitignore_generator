/*
 * GitignoreGenerator
 * https://github.com/sandsbit/GitignoreGenerator
 *
 * Copyright (C) 2020 Nikita Serba. All rights reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package me.nikitaserba.GitignoreGenerator.api.exceptions;

/**
 * This exception if thrown in GitignoreSource classes if there are some
 * errors while parsing gitignore template.
 *
 * @version 1.0
 */
public class TemplateParsingException extends GitignoreGeneratorException {
    public TemplateParsingException() {
        super();
    }

    public TemplateParsingException(String message) {
        super(message);
    }

    public TemplateParsingException(String message, Throwable cause) {
        super(message, cause);
    }

    public TemplateParsingException(Throwable cause) {
        super(cause);
    }

    protected TemplateParsingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}