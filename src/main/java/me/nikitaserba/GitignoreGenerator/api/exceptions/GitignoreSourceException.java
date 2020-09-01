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
 * Base class for all GitignoreSource exceptions.
 */
public class GitignoreSourceException extends GitignoreGeneratorException {
    public GitignoreSourceException() {
        super();
    }

    public GitignoreSourceException(String message) {
        super(message);
    }

    public GitignoreSourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public GitignoreSourceException(Throwable cause) {
        super(cause);
    }

    protected GitignoreSourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}